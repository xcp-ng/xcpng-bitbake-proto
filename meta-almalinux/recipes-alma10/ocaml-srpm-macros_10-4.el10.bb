
PN = "ocaml-srpm-macros"
PE = "0"
PV = "10"
PR = "4.el10"
PACKAGES = "ocaml-srpm-macros"


URI_ocaml-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ocaml-srpm-macros-10-4.el10.noarch.rpm;unpack=0"
RDEPENDS:ocaml-srpm-macros = ""
RPROVIDES:ocaml-srpm-macros = "rpm_macro(ocaml_natdynlink) ( ) rpm_macro(ocaml_native_compiler) ( ) rpm_macro(ocaml_native_profiling) ( ) rpm_macro(ocaml_pkg) ( ) rpm_macro(ocamldir) ( ) rpm_macro(odoc_package) ( ) ocaml-srpm-macros ( =  10-4.el10)"
