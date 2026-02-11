
PN = "libselinux"
PE = "0"
PV = "3.8"
PR = "2.el10_0"
PACKAGES = "libselinux libselinux-utils libselinux-devel libselinux-ruby python3-libselinux libselinux-static"


URI_libselinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libselinux-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux = "
 glibc
 pcre2
 libsepol
"

URI_libselinux-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libselinux-utils-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-utils = "
 glibc
 libselinux
 pcre2
 libsepol
"

URI_libselinux-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libselinux-devel-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-devel = "
 libselinux
 libsepol-devel
 pkgconf-pkg-config
 pcre2-devel
"

URI_libselinux-ruby = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libselinux-ruby-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-ruby = "
 glibc
 libselinux
 ruby-libs
"

URI_python3-libselinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libselinux-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libselinux = "
 glibc
 libselinux
 python3
"

URI_libselinux-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libselinux-static-3.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libselinux-static = "
 libselinux-devel
"
