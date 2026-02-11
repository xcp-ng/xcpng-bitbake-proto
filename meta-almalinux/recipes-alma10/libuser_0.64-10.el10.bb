
PN = "libuser"
PE = "0"
PV = "0.64"
PR = "10.el10"
PACKAGES = "libuser libuser-devel python3-libuser"


URI_libuser = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libuser-0.64-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libuser = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libselinux.so.1()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libpopt.so.0()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libaudit.so.1()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libpam_misc.so.0()(64bit) ( ) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) ( )"
RPROVIDES:libuser = "libuser.so.1()(64bit) ( ) config(libuser) ( =  0.64-10.el10) libuser ( =  0.64-10.el10) libuser(x86-64) ( =  0.64-10.el10)"

URI_libuser-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libuser-devel-0.64-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libuser-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gmodule-no-export-2.0) ( ) glib2-devel(x86-64) ( ) libuser.so.1()(64bit) ( ) libuser(x86-64) ( =  0.64-10.el10)"
RPROVIDES:libuser-devel = "libuser-devel ( =  0.64-10.el10) libuser-devel(x86-64) ( =  0.64-10.el10) pkgconfig(libuser) ( =  0.62)"

URI_python3-libuser = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libuser-0.64-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libuser = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libselinux.so.1()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libaudit.so.1()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libuser.so.1()(64bit) ( ) python(abi) ( =  3.12) libuser(x86-64) ( =  0.64-10.el10)"
RPROVIDES:python3-libuser = "libuser-python3 ( =  0.64-10.el10) libuser-python3(x86-64) ( =  0.64-10.el10) python-libuser ( =  0.64-10.el10) python3-libuser ( =  0.64-10.el10) python3-libuser(x86-64) ( =  0.64-10.el10) python3.12-libuser ( =  0.64-10.el10)"
