
PN = "libsecret"
PE = "0"
PV = "0.21.2"
PR = "7.el10"
PACKAGES = "libsecret libsecret-devel"


URI_libsecret = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsecret-0.21.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsecret = "
 glibc
 libgcc
 gnutls
 glib2
"

URI_libsecret-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsecret-devel-0.21.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsecret-devel = "
 glib2-devel
 gnutls-devel
 pkgconf-pkg-config
 libsecret
 libsecret-devel
"
