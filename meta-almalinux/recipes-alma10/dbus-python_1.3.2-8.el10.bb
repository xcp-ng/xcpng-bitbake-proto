
PN = "dbus-python"
PE = "0"
PV = "1.3.2"
PR = "8.el10"
PACKAGES = "python3-dbus dbus-python-devel"


URI_python3-dbus = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dbus-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-dbus = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-dbus = "python-dbus ( =  1.3.2-8.el10) python3-dbus ( =  1.3.2-8.el10) python3-dbus(x86-64) ( =  1.3.2-8.el10) python3.12-dbus ( =  1.3.2-8.el10) python3.12dist(dbus-python) ( =  1.3.2) python3dist(dbus-python) ( =  1.3.2)"

URI_dbus-python-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dbus-python-devel-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-python-devel = "/usr/bin/pkg-config ( ) pkgconfig(dbus-1) ( >=  1.0)"
RPROVIDES:dbus-python-devel = "dbus-python-devel ( =  1.3.2-8.el10) dbus-python-devel(x86-64) ( =  1.3.2-8.el10) pkgconfig(dbus-python) ( =  1.3.2)"
