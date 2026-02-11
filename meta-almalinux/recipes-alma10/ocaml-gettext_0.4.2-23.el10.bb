
PN = "ocaml-gettext"
PE = "0"
PV = "0.4.2"
PR = "23.el10"
PACKAGES = "ocaml-gettext ocaml-gettext-devel"


URI_ocaml-gettext = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-gettext-0.4.2-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-gettext = "
 glibc
 ocaml-runtime
 ocaml-fileutils
"

URI_ocaml-gettext-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-gettext-devel-0.4.2-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-gettext-devel = "
 ocaml-runtime
 ocaml
 ocaml-fileutils
 ocaml-fileutils-devel
 libzstd
 ocaml-gettext
 glibc
"
