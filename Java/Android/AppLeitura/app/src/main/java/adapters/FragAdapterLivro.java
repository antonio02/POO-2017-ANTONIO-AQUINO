package adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.antonio.appleitura.FragmentoLivro;

import java.util.ArrayList;
import java.util.List;

public class FragAdapterLivro extends FragmentPagerAdapter {

    private List<String> tabs = new ArrayList<>();

    public FragAdapterLivro(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return FragmentoLivro.newInstance("lido");
            case 2:
                return FragmentoLivro.newInstance("lendo");
            case 3:
                return FragmentoLivro.newInstance("desejo");
            case 4:
                return FragmentoLivro.newInstance("desisti");
            default:
                return FragmentoLivro.newInstance(null);
        }
    }

    public void addTab(String s){
        tabs.add(s);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position);
    }
}
