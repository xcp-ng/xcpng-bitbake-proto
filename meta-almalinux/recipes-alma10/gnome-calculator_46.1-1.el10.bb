
PN = "gnome-calculator"
PE = "0"
PV = "46.1"
PR = "1.el10"
PACKAGES = "gnome-calculator gnome-calculator-devel"


URI_gnome-calculator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-calculator-46.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-calculator = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libadwaita-1.so.0()(64bit) ( ) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libmpc.so.3()(64bit) ( ) libgtksourceview-5.so.0()(64bit) ( ) libgee-0.8.so.2()(64bit) ( ) libadwaita(x86-64) ( >=  1.4~alpha) gtksourceview5(x86-64) ( >=  5.3.0)"
RPROVIDES:gnome-calculator = "metainfo() ( ) application() ( ) application(org.gnome.Calculator.desktop) ( ) libgcalc-2.so.1.0.1()(64bit) ( ) libgci-1.so.0.0.0()(64bit) ( ) metainfo(org.gnome.Calculator.appdata.xml) ( ) gnome-calculator ( =  46.1-1.el10) gnome-calculator(x86-64) ( =  46.1-1.el10)"

URI_gnome-calculator-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-calculator-devel-46.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-calculator-devel = "/usr/bin/pkg-config ( ) libgcalc-2.so.1.0.1()(64bit) ( ) libgci-1.so.0.0.0()(64bit) ( ) gnome-calculator(x86-64) ( =  46.1-1.el10) pkgconfig(gcalc-2) ( >=  3.34) pkgconfig(gee-0.8) ( >=  0.20) pkgconfig(gio-2.0) ( >=  2.50) pkgconfig(gtk4) ( >=  4.4.1)"
RPROVIDES:gnome-calculator-devel = "gnome-calculator-devel ( =  46.1-1.el10) gnome-calculator-devel(x86-64) ( =  46.1-1.el10) pkgconfig(gcalc-2) ( =  46.1) pkgconfig(gci-1) ( =  46.1)"
