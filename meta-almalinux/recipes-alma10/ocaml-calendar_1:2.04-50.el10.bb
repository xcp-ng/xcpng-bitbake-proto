
inherit dnf-bridge

PN = "ocaml-calendar"
PE = "1"
PV = "2.04"
PR = "50.el10"
PACKAGES = "ocaml-calendar ocaml-calendar-devel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/ocaml-calendar-2.04-50.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ocaml-calendar = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-calendar-2.04-50.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-calendar}"
RDEPENDS:ocaml-calendar = " \
 ocaml-runtime \
 ocaml \
"

URI_ocaml-calendar-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-calendar-devel-2.04-50.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-calendar-devel}"
RDEPENDS:ocaml-calendar-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-calendar \
"
