
PN = "ocaml-calendar"
PE = "1"
PV = "2.04"
PR = "50.el10"
PACKAGES = "ocaml-calendar ocaml-calendar-devel"


URI_ocaml-calendar = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-calendar-2.04-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-calendar = " \
 ocaml-runtime \
 ocaml \
"

URI_ocaml-calendar-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-calendar-devel-2.04-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-calendar-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-calendar \
"
