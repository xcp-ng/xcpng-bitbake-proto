
PN = "tecla"
PE = "0"
PV = "45.0"
PR = "5.el10"
PACKAGES = "tecla tecla-devel"


URI_tecla = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tecla-45.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tecla = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libadwaita-1.so.0()(64bit) ( ) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libxkbcommon.so.0(V_0.6.0)(64bit) ( )"
RPROVIDES:tecla = "application() ( ) application(org.gnome.Tecla.desktop) ( ) tecla ( =  45.0-5.el10) tecla(x86-64) ( =  45.0-5.el10)"

URI_tecla-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tecla-devel-45.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tecla-devel = "/usr/bin/pkg-config ( ) tecla(x86-64) ( =  45.0-5.el10)"
RPROVIDES:tecla-devel = "pkgconfig(tecla) ( =  45.0) tecla-devel ( =  45.0-5.el10) tecla-devel(x86-64) ( =  45.0-5.el10)"
