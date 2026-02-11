
PN = "dconf"
PE = "0"
PV = "0.40.0"
PR = "16.el10"
PACKAGES = "dconf dconf-devel"


URI_dconf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dconf-0.40.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dconf = "/bin/sh ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) dbus ( ) glib2(x86-64) ( >=  2.44.0)"
RPROVIDES:dconf = "libdconf.so.1()(64bit) ( ) bundled(gvdb) ( ) libdconfsettings.so()(64bit) ( ) config(dconf) ( =  0.40.0-16.el10) dconf ( =  0.40.0-16.el10) dconf(x86-64) ( =  0.40.0-16.el10)"

URI_dconf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dconf-devel-0.40.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dconf-devel = "/usr/bin/pkg-config ( ) libdconf.so.1()(64bit) ( ) dconf(x86-64) ( =  0.40.0-16.el10) pkgconfig(gio-2.0) ( >=  2.25.7)"
RPROVIDES:dconf-devel = "dconf-devel ( =  0.40.0-16.el10) dconf-devel(x86-64) ( =  0.40.0-16.el10) pkgconfig(dconf) ( =  0.40.0)"
