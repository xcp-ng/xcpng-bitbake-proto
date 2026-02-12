
inherit dnf-bridge

PN = "ocaml-curses"
PE = "0"
PV = "1.0.11"
PR = "12.el10"
PACKAGES = "ocaml-curses ocaml-curses-devel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/ocaml-curses-1.0.11-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ocaml-curses = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-curses-1.0.11-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-curses}"
RDEPENDS:ocaml-curses = " \
 glibc \
 ocaml-runtime \
 ncurses-libs \
"

URI_ocaml-curses-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-curses-devel-1.0.11-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-curses-devel}"
RDEPENDS:ocaml-curses-devel = " \
 ncurses-devel \
 ocaml-runtime \
 ocaml \
 ocaml-curses \
"
