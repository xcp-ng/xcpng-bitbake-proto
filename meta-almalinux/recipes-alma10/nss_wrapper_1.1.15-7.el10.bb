
PN = "nss_wrapper"
PE = "0"
PV = "1.1.15"
PR = "7.el10"
PACKAGES = "nss_wrapper nss_wrapper-libs"


URI_nss_wrapper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss_wrapper-1.1.15-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss_wrapper = "
 cmake-filesystem
 perl-libs
 pkgconf-pkg-config
 perl-Getopt-Long
 perl-PathTools
 nss_wrapper-libs
 perl-interpreter
"

URI_nss_wrapper-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss_wrapper-libs-1.1.15-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nss_wrapper-libs = "
 glibc
"
