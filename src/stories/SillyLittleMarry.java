package stories;
//prototype
public class SillyLittleMarry {
    public static void main(String[] args) {
Girl marry=new Girl("marry");
        System.out.println(marry.toString());

        Girl noMarry= marry.clone();
        noMarry.setName("noMarry");
        noMarry.setSilly(false);
        noMarry.setLittle(false);
        System.out.println(noMarry.clone());
    }
}
class Girl implements Cloneable{

    @Override
    public  Girl clone(){
        try {
            return (Girl)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    private String name;
    private boolean silly;
    private boolean little;
    private boolean lazy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSilly() {
        return silly;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public boolean isLittle() {
        return little;
    }

    public void setLittle(boolean little) {
        this.little = little;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    public Girl(String name){
        this.name=name;
        silly=true;
        little=true;
        lazy=true;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", little=" + little +
                ", lazy=" + lazy +
                '}';
    }
}