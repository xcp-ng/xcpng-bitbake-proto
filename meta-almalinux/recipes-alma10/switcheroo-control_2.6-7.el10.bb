
PN = "switcheroo-control"
PE = "0"
PV = "2.6"
PR = "7.el10"
PACKAGES = "switcheroo-control switcheroo-control-docs"


URI_switcheroo-control = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/switcheroo-control-2.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:switcheroo-control = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( )"
RPROVIDES:switcheroo-control = "switcheroo-control ( =  2.6-7.el10) switcheroo-control(x86-64) ( =  2.6-7.el10)"

URI_switcheroo-control-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/switcheroo-control-docs-2.6-7.el10.noarch.rpm;unpack=0"
RDEPENDS:switcheroo-control-docs = ""
RPROVIDES:switcheroo-control-docs = "switcheroo-control-docs ( =  2.6-7.el10)"
