
PN = "realmd"
PE = "0"
PV = "0.17.1"
PR = "12.el10"
PACKAGES = "realmd realmd-devel-docs"


URI_realmd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/realmd-0.17.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:realmd = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) polkit ( ) libpolkit-gobject-1.so.0()(64bit) ( ) authselect ( )"
RPROVIDES:realmd = "realmd ( =  0.17.1-12.el10) realmd(x86-64) ( =  0.17.1-12.el10)"

URI_realmd-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/realmd-devel-docs-0.17.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:realmd-devel-docs = ""
RPROVIDES:realmd-devel-docs = "realmd-devel-docs ( =  0.17.1-12.el10) realmd-devel-docs(x86-64) ( =  0.17.1-12.el10)"
