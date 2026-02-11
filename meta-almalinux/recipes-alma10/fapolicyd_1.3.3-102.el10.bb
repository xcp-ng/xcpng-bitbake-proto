
PN = "fapolicyd"
PE = "0"
PV = "1.3.3"
PR = "102.el10"
PACKAGES = "fapolicyd fapolicyd-selinux"


URI_fapolicyd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fapolicyd-1.3.3-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fapolicyd = "/bin/sh ( ) shadow-utils ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libseccomp.so.2()(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) liblmdb.so.0.0.0()(64bit) ( ) libmagic.so.1()(64bit) ( ) rpm-plugin-fapolicyd ( )"
RPROVIDES:fapolicyd = "fapolicyd ( =  1.3.3-102.el10) config(fapolicyd) ( =  1.3.3-102.el10) fapolicyd(x86-64) ( =  1.3.3-102.el10)"

URI_fapolicyd-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fapolicyd-selinux-1.3.3-102.el10.noarch.rpm;unpack=0"
RDEPENDS:fapolicyd-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.13) selinux-policy ( >=  40.13.13) fapolicyd ( =  1.3.3-102.el10)"
RPROVIDES:fapolicyd-selinux = "fapolicyd-selinux ( =  1.3.3-102.el10)"
