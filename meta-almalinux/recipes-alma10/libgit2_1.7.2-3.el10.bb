
PN = "libgit2"
PE = "0"
PV = "1.7.2"
PR = "3.el10"
PACKAGES = "libgit2 libgit2-devel"


URI_libgit2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libgit2-1.7.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgit2 = "
 zlib-ng-compat
 openssl-libs
 libgcc
 pcre2
 llhttp
 glibc
"

URI_libgit2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libgit2-devel-1.7.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgit2-devel = "
 libgit2
 zlib-ng-compat-devel
 pkgconf-pkg-config
 pcre2-devel
 openssl-devel
"
