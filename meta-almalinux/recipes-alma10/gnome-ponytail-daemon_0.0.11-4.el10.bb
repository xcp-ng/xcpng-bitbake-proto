
PN = "gnome-ponytail-daemon"
PE = "0"
PV = "0.0.11"
PR = "4.el10"
PACKAGES = "gnome-ponytail-daemon python3-gnome-ponytail-daemon"


URI_gnome-ponytail-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-ponytail-daemon-0.0.11-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-ponytail-daemon = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libei.so.1()(64bit) ( )"
RPROVIDES:gnome-ponytail-daemon = "gnome-ponytail-daemon ( =  0.0.11-4.el10) gnome-ponytail-daemon(x86-64) ( =  0.0.11-4.el10)"

URI_python3-gnome-ponytail-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-gnome-ponytail-daemon-0.0.11-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-gnome-ponytail-daemon = "python3-gobject ( ) python3-dbus ( ) python(abi) ( =  3.12) gnome-ponytail-daemon ( =  0.0.11-4.el10)"
RPROVIDES:python3-gnome-ponytail-daemon = "python-gnome-ponytail-daemon ( =  0.0.11-4.el10) python3-gnome-ponytail-daemon ( =  0.0.11-4.el10) python3.12-gnome-ponytail-daemon ( =  0.0.11-4.el10)"
