
PN = "augeas"
PE = "0"
PV = "1.14.2"
PR = "0.2.20240909git2de06e0.el10"
PACKAGES = "augeas augeas-libs augeas-devel augeas-bash-completion augeas-static"


URI_augeas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/augeas-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas = "
 glibc
 libgcc
 readline
 augeas-libs
"

URI_augeas-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/augeas-libs-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas-libs = "
 glibc
 libselinux
 libxml2
"

URI_augeas-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/augeas-devel-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas-devel = "
 libxml2-devel
 libselinux-devel
 pkgconf-pkg-config
 augeas-libs
"

URI_augeas-bash-completion = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/augeas-bash-completion-1.14.2-0.2.20240909git2de06e0.el10.noarch.rpm;unpack=0"
RDEPENDS:augeas-bash-completion = "
 augeas
 bash-completion
"

URI_augeas-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/augeas-static-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas-static = "
 augeas-devel
"
