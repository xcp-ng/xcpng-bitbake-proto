
inherit dnf-bridge

PN = "ocaml-labltk"
PE = "0"
PV = "8.06.13"
PR = "14.el10"
PACKAGES = "ocaml-labltk ocaml-labltk-devel ocaml-labltk-doc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/ocaml-labltk-8.06.13-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ocaml-labltk = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-labltk-8.06.13-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-labltk}"
RDEPENDS:ocaml-labltk = " \
 ocaml-runtime \
 tk \
 tcl \
 bash \
 glibc \
"

URI_ocaml-labltk-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-labltk-devel-8.06.13-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-labltk-devel}"
RDEPENDS:ocaml-labltk-devel = " \
 tcl-devel \
 ocaml \
 ocaml-runtime \
 tk-devel \
 ocaml-labltk \
"

URI_ocaml-labltk-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-labltk-doc-8.06.13-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ocaml-labltk-doc}"
RDEPENDS:ocaml-labltk-doc = ""
