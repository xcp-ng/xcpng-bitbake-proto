
PN = "ocaml-augeas"
PE = "0"
PV = "0.6"
PR = "37.el10"
PACKAGES = "ocaml-augeas ocaml-augeas-devel"


URI_ocaml-augeas = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-augeas-0.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-augeas = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libaugeas.so.0()(64bit) ( ) libaugeas.so.0(AUGEAS_0.1.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.10.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.11.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.16.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.22.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.8.0)(64bit) ( ) ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Callback) ( =  b855f824a6cb0f4b58dc69a6e79a49a1)"
RPROVIDES:ocaml-augeas = "ocaml(Augeas) ( =  22f338988a113b702acdb316aae062a0) ocaml-augeas ( =  0.6-37.el10) ocaml-augeas(x86-64) ( =  0.6-37.el10)"

URI_ocaml-augeas-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-augeas-devel-0.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-augeas-devel = "ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Callback) ( =  b855f824a6cb0f4b58dc69a6e79a49a1) ocamlx(Stdlib__Callback) ( =  bafc96ea60f2aa399fe753ac0e40f764) ocaml-augeas(x86-64) ( =  0.6-37.el10)"
RPROVIDES:ocaml-augeas-devel = "ocaml(Augeas) ( =  22f338988a113b702acdb316aae062a0) ocaml-augeas-devel ( =  0.6-37.el10) ocaml-augeas-devel(x86-64) ( =  0.6-37.el10) ocamlx(Augeas) ( =  1088ca0ba21d91edef9d6d0c03ac9e83)"
