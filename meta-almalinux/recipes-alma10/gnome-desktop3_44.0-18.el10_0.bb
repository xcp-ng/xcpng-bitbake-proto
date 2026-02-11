
PN = "gnome-desktop3"
PE = "0"
PV = "44.0"
PR = "18.el10_0"
PACKAGES = "gnome-desktop3 gnome-desktop4 gnome-desktop3-devel gnome-desktop4-devel gnome-desktop3-tests"


URI_gnome-desktop3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-desktop3-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libudev.so.1()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libseccomp.so.2()(64bit) ( ) shared-mime-info ( ) bubblewrap ( ) libxkbregistry.so.0()(64bit) ( ) libudev.so.1(LIBUDEV_196)(64bit) ( ) libxkbregistry.so.0(V_1.0.0)(64bit) ( ) gdk-pixbuf2(x86-64) ( >=  2.36.5) glib2(x86-64) ( >=  2.53.0) gsettings-desktop-schemas ( >=  3.27.0)"
RPROVIDES:gnome-desktop3 = "libgnome-desktop-3.so.20()(64bit) ( ) gnome-desktop3(x86-64) ( =  44.0-18.el10_0) gnome-desktop3 ( =  44.0-18.el10_0)"

URI_gnome-desktop4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-desktop4-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop4 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libudev.so.1()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libseccomp.so.2()(64bit) ( ) libxkbregistry.so.0()(64bit) ( ) libudev.so.1(LIBUDEV_196)(64bit) ( ) libxkbregistry.so.0(V_1.0.0)(64bit) ( ) gnome-desktop3(x86-64) ( =  44.0-18.el10_0)"
RPROVIDES:gnome-desktop4 = "libgnome-desktop-4.so.2()(64bit) ( ) libgnome-bg-4.so.2()(64bit) ( ) libgnome-rr-4.so.2()(64bit) ( ) gnome-desktop4 ( =  44.0-18.el10_0) gnome-desktop4(x86-64) ( =  44.0-18.el10_0)"

URI_gnome-desktop3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-desktop3-devel-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop3-devel = "/usr/bin/pkg-config ( ) pkgconfig(libsystemd) ( ) pkgconfig(libseccomp) ( ) pkgconfig(libudev) ( ) pkgconfig(iso-codes) ( ) pkgconfig(xkbregistry) ( ) pkgconfig(xkeyboard-config) ( ) libgnome-desktop-3.so.20()(64bit) ( ) pkgconfig(gdk-pixbuf-2.0) ( >=  2.36.5) pkgconfig(gio-2.0) ( >=  2.53.0) pkgconfig(gio-unix-2.0) ( >=  2.53.0) pkgconfig(glib-2.0) ( >=  2.53.0) pkgconfig(gsettings-desktop-schemas) ( >=  3.27.0) gnome-desktop3(x86-64) ( =  44.0-18.el10_0) pkgconfig(gtk+-3.0) ( >=  3.3.6)"
RPROVIDES:gnome-desktop3-devel = "gnome-desktop3-devel ( =  44.0-18.el10_0) gnome-desktop3-devel(x86-64) ( =  44.0-18.el10_0) pkgconfig(gnome-desktop-3.0) ( =  44.0)"

URI_gnome-desktop4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-desktop4-devel-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop4-devel = "/usr/bin/pkg-config ( ) pkgconfig(libsystemd) ( ) pkgconfig(libseccomp) ( ) pkgconfig(libudev) ( ) pkgconfig(gnome-desktop-4) ( ) pkgconfig(iso-codes) ( ) pkgconfig(xkbregistry) ( ) pkgconfig(xkeyboard-config) ( ) libgnome-bg-4.so.2()(64bit) ( ) libgnome-desktop-4.so.2()(64bit) ( ) libgnome-rr-4.so.2()(64bit) ( ) pkgconfig(gdk-pixbuf-2.0) ( >=  2.36.5) pkgconfig(gio-2.0) ( >=  2.53.0) pkgconfig(gio-unix-2.0) ( >=  2.53.0) pkgconfig(glib-2.0) ( >=  2.53.0) pkgconfig(gsettings-desktop-schemas) ( >=  3.27.0) gnome-desktop4(x86-64) ( =  44.0-18.el10_0) pkgconfig(gtk4) ( >=  4.4.0)"
RPROVIDES:gnome-desktop4-devel = "gnome-desktop4-devel ( =  44.0-18.el10_0) gnome-desktop4-devel(x86-64) ( =  44.0-18.el10_0) pkgconfig(gnome-bg-4) ( =  44.0) pkgconfig(gnome-desktop-4) ( =  44.0) pkgconfig(gnome-rr-4) ( =  44.0)"

URI_gnome-desktop3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gnome-desktop3-tests-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop3-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libgnome-desktop-3.so.20()(64bit) ( ) gnome-desktop3(x86-64) ( =  44.0-18.el10_0)"
RPROVIDES:gnome-desktop3-tests = "gnome-desktop3-tests ( =  44.0-18.el10_0) gnome-desktop3-tests(x86-64) ( =  44.0-18.el10_0)"
