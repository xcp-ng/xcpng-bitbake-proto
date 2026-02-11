
inherit dnf-bridge

PN = "ocaml-ocamlbuild"
PE = "0"
PV = "0.14.3"
PR = "7.el10"
PACKAGES = "ocaml-ocamlbuild ocaml-ocamlbuild-doc"


URI_ocaml-ocamlbuild = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-ocamlbuild-0.14.3-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-ocamlbuild = " \
 glibc \
 ocaml-runtime \
 ncurses \
 ocaml \
"

URI_ocaml-ocamlbuild-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-ocamlbuild-doc-0.14.3-7.el10.noarch.rpm;unpack=0"
RDEPENDS:ocaml-ocamlbuild-doc = ""
