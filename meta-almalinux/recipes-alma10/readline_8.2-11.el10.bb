
inherit dnf-bridge

PN = "readline"
PE = "0"
PV = "8.2"
PR = "11.el10"
PACKAGES = "readline readline-devel readline-static"


URI_readline = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/readline-8.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:readline = " \
 glibc \
 ncurses-libs \
"

URI_readline-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/readline-devel-8.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:readline-devel = " \
 ncurses-devel \
 readline \
 pkgconf-pkg-config \
"

URI_readline-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/readline-static-8.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:readline-static = " \
 readline-devel \
"
