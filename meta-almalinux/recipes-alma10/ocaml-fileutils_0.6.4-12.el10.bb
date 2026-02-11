
PN = "ocaml-fileutils"
PE = "0"
PV = "0.6.4"
PR = "12.el10"
PACKAGES = "ocaml-fileutils ocaml-fileutils-devel"


URI_ocaml-fileutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-fileutils-0.6.4-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-fileutils = " \
 glibc \
 ocaml-runtime \
"

URI_ocaml-fileutils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-fileutils-devel-0.6.4-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-fileutils-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-fileutils \
"
