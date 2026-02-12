
inherit dnf-bridge

PN = "ocaml-srpm-macros"
PE = "0"
PV = "10"
PR = "4.el10"
PACKAGES = "ocaml-srpm-macros"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ocaml-srpm-macros-10-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ocaml-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ocaml-srpm-macros-10-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ocaml-srpm-macros}"
RDEPENDS:ocaml-srpm-macros = ""
