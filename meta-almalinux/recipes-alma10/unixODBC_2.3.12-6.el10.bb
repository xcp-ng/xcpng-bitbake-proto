
PN = "unixODBC"
PE = "0"
PV = "2.3.12"
PR = "6.el10"
PACKAGES = "unixODBC unixODBC-devel"


URI_unixODBC = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unixODBC-2.3.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:unixODBC = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libreadline.so.8()(64bit) ( ) libltdl.so.7()(64bit) ( )"
RPROVIDES:unixODBC = "libodbc.so.2()(64bit) ( ) libodbcinst.so.2()(64bit) ( ) libnn.so.2()(64bit) ( ) libodbccr.so.2()(64bit) ( ) libtemplate.so.2()(64bit) ( ) config(unixODBC) ( =  2.3.12-6.el10) unixODBC ( =  2.3.12-6.el10) unixODBC(x86-64) ( =  2.3.12-6.el10)"

URI_unixODBC-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/unixODBC-devel-2.3.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:unixODBC-devel = "/usr/bin/pkg-config ( ) libodbc.so.2()(64bit) ( ) pkgconfig(odbc) ( ) libnn.so.2()(64bit) ( ) libodbccr.so.2()(64bit) ( ) libodbcinst.so.2()(64bit) ( ) libtemplate.so.2()(64bit) ( ) unixODBC(x86-64) ( =  2.3.12-6.el10)"
RPROVIDES:unixODBC-devel = "pkgconfig(odbc) ( =  2.3.12) pkgconfig(odbccr) ( =  2.3.12) pkgconfig(odbcinst) ( =  2.3.12) unixODBC-devel ( =  2.3.12-6.el10) unixODBC-devel(x86-64) ( =  2.3.12-6.el10)"
