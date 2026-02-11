
inherit dnf-bridge

PN = "ocaml-augeas"
PE = "0"
PV = "0.6"
PR = "37.el10"
PACKAGES = "ocaml-augeas ocaml-augeas-devel"


URI_ocaml-augeas = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-augeas-0.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-augeas = " \
 glibc \
 ocaml-runtime \
 augeas-libs \
"

URI_ocaml-augeas-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-augeas-devel-0.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-augeas-devel = " \
 ocaml-runtime \
 ocaml-augeas \
 ocaml \
"
