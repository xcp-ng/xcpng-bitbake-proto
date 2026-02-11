
PN = "librelp"
PE = "0"
PV = "1.11.0"
PR = "7.el10"
PACKAGES = "librelp librelp-devel"


URI_librelp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librelp-1.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librelp = "
 glibc
 openssl-libs
 gnutls
"

URI_librelp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librelp-devel-1.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librelp-devel = "
 pkgconf-pkg-config
 librelp
"
