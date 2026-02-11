
PN = "ocaml-findlib"
PE = "0"
PV = "1.9.6"
PR = "15.el10"
PACKAGES = "ocaml-findlib ocaml-findlib-devel"


URI_ocaml-findlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-findlib-1.9.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-findlib = " \
 glibc \
 ocaml \
 ocaml-runtime \
 ocaml-compiler-libs \
"

URI_ocaml-findlib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-findlib-devel-1.9.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-findlib-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-compiler-libs \
 ocaml-findlib \
"
