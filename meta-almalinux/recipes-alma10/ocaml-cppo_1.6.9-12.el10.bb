
inherit dnf-bridge

PN = "ocaml-cppo"
PE = "0"
PV = "1.6.9"
PR = "12.el10"
PACKAGES = "ocaml-cppo ocaml-cppo-ocamlbuild"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/ocaml-cppo-1.6.9-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ocaml-cppo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-cppo-1.6.9-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-cppo}"
RDEPENDS:ocaml-cppo = " \
 glibc \
"

URI_ocaml-cppo-ocamlbuild = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-cppo-ocamlbuild-1.6.9-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-cppo-ocamlbuild}"
RDEPENDS:ocaml-cppo-ocamlbuild = " \
 ocaml-runtime \
 ocaml \
 ocaml-cppo \
 glibc \
 ocaml-ocamlbuild \
"
