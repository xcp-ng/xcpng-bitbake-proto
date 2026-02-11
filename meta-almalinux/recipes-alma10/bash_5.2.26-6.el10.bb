
PN = "bash"
PE = "0"
PV = "5.2.26"
PR = "6.el10"
PACKAGES = "bash bash-devel bash-doc"


URI_bash = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bash-5.2.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bash = "
 glibc
 filesystem
 ncurses-libs
"

URI_bash-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bash-devel-5.2.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bash-devel = "
 bash
 pkgconf-pkg-config
"

URI_bash-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bash-doc-5.2.26-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bash-doc = "
 bash
"
