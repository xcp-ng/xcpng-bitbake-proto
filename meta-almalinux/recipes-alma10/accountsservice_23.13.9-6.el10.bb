
PN = "accountsservice"
PE = "0"
PV = "23.13.9"
PR = "6.el10"
PACKAGES = "accountsservice accountsservice-libs accountsservice-devel"


URI_accountsservice = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/accountsservice-23.13.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accountsservice = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) shadow-utils ( ) libpolkit-gobject-1.so.0()(64bit) ( ) polkit ( )"
RPROVIDES:accountsservice = "accountsservice(x86-64) ( =  23.13.9-6.el10) accountsservice ( =  23.13.9-6.el10)"

URI_accountsservice-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/accountsservice-libs-23.13.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accountsservice-libs = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) accountsservice(x86-64) ( =  23.13.9-6.el10)"
RPROVIDES:accountsservice-libs = "libaccountsservice.so.0()(64bit) ( ) accountsservice-libs ( =  23.13.9-6.el10) accountsservice-libs(x86-64) ( =  23.13.9-6.el10)"

URI_accountsservice-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/accountsservice-devel-23.13.9-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accountsservice-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(polkit-gobject-1) ( ) libaccountsservice.so.0()(64bit) ( ) accountsservice-libs(x86-64) ( =  23.13.9-6.el10)"
RPROVIDES:accountsservice-devel = "accountsservice-devel ( =  23.13.9-6.el10) accountsservice-devel(x86-64) ( =  23.13.9-6.el10) pkgconfig(accountsservice) ( =  24.50.0)"
