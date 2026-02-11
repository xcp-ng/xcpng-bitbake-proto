
PN = "ocaml"
PE = "0"
PV = "5.2.0"
PR = "4.el10"
PACKAGES = "ocaml ocaml-compiler-libs ocaml-docs ocaml-ocamldoc ocaml-rpm-macros ocaml-runtime ocaml-source"


URI_ocaml = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-5.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml = "
 ocaml-runtime
 ocaml-srpm-macros
 redhat-rpm-config
 libzstd-devel
 libzstd
 gcc
 glibc
"

URI_ocaml-compiler-libs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-compiler-libs-5.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-compiler-libs = "
 ocaml-runtime
 ocaml
"

URI_ocaml-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-docs-5.2.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:ocaml-docs = "
 ocaml
"

URI_ocaml-ocamldoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-ocamldoc-5.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-ocamldoc = "
 ocaml-runtime
 ocaml
 ocaml-compiler-libs
 libzstd
 glibc
"

URI_ocaml-rpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-rpm-macros-5.2.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:ocaml-rpm-macros = "
 python3
 ocaml
"

URI_ocaml-runtime = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-runtime-5.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-runtime = "
 glibc
 libgcc
 util-linux
 libzstd
"

URI_ocaml-source = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-source-5.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-source = "
 ocaml
"
