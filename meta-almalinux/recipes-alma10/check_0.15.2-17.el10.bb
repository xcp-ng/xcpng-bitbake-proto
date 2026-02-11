
PN = "check"
PE = "0"
PV = "0.15.2"
PR = "17.el10"
PACKAGES = "check check-devel check-static check-checkmk"


URI_check = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/check-0.15.2-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:check = "
 glibc
 libgcc
"

URI_check-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/check-devel-0.15.2-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:check-devel = "
 cmake-filesystem
 pkgconf-pkg-config
 check-static
 check
"

URI_check-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/check-static-0.15.2-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:check-static = ""

URI_check-checkmk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/check-checkmk-0.15.2-17.el10.noarch.rpm;unpack=0"
RDEPENDS:check-checkmk = "
 gawk
 check
"
