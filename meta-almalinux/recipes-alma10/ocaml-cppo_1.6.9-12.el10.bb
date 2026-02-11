
PN = "ocaml-cppo"
PE = "0"
PV = "1.6.9"
PR = "12.el10"
PACKAGES = "ocaml-cppo ocaml-cppo-ocamlbuild"


URI_ocaml-cppo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-cppo-1.6.9-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-cppo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( )"
RPROVIDES:ocaml-cppo = "ocaml-cppo ( =  1.6.9-12.el10) ocaml-cppo(x86-64) ( =  1.6.9-12.el10)"

URI_ocaml-cppo-ocamlbuild = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-cppo-ocamlbuild-1.6.9-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-cppo-ocamlbuild = "rtld(GNU_HASH) ( ) ocaml-ocamlbuild(x86-64) ( ) ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Either) ( =  d56b2e9ca14b69fdeef09f3b2fbd10ad) ocaml(Stdlib__Seq) ( =  ac22688c50c848ab417492a023ff76ab) ocaml(Stdlib__Uchar) ( =  7eb8f0d1a7c18933885eaef3b23d79f4) ocaml(Stdlib__Buffer) ( =  95ef512a7236f1bacc50f09f9c168696) ocaml(Stdlib__Domain) ( =  a456c9e3e2f48243314ef1be35f4d446) ocaml(Stdlib__Format) ( =  702457daf23d31d60ed421880364809f) ocaml(Stdlib__Lexing) ( =  d530e1b331fd907548b19994db369785) ocaml(CamlinternalLazy) ( =  28173492bf873b63b1060c5b0431a0ea) ocaml(Stdlib__Hashtbl) ( =  a95c460b872969c8d1b778e529006189) ocaml(Stdlib__Lazy) ( =  757b1a23dec7f8ff3ce03118ba27943a) ocaml(Stdlib__List) ( =  0cd6f52e67f5324941afcf7df215a281) ocaml(Stdlib__String) ( =  cdb3775f91c0e999766c3b2a50f03a7d) ocaml(Stdlib__Sys) ( =  2e2014075d059884968a977ade23ac1f) ocamlx(Stdlib) ( =  447646e3941e7bd0789ef2758721e0f3) ocamlx(Stdlib__List) ( =  0c98d5e09fe7a58103f7fc0c065faf7b) ocaml(Stdlib__Set) ( =  e9b5fe6ac716b65c5e3c97f68818280d) ocamlx(Stdlib__Hashtbl) ( =  32e5b8b459bfbe8d42f9cbdc0881f25b) ocamlx(Stdlib__Sys) ( =  820f8619a35f5702e8ebee2cc4b857a0) ocamlx(Stdlib__Set) ( =  b049494df265ec800bd69fa20b58ded4) ocaml(Stdlib__Digest) ( =  53c6b4c2a619a2a05fa4912189aff5db) ocaml(Stdlib__Arg) ( =  05ccbf24bdb0d5efd37f5ebb7958ae46) ocaml-cppo(x86-64) ( =  1.6.9-12.el10) ocaml(Ocamlbuild_pack) ( =  78c5dce79a2791d2975a86fcd915f92b) ocaml(Ocamlbuild_plugin) ( =  cde2a012bf834241fadecc1698bbed75) ocamlx(Ocamlbuild_pack) ( =  421476006aae1c1a879c5b05730be822) ocamlx(Ocamlbuild_plugin) ( =  e920419e371168e98d9a121824c7859d)"
RPROVIDES:ocaml-cppo-ocamlbuild = "ocaml(Ocamlbuild_cppo) ( =  6ca11d1bdc8ac6a9c3ebe6a7fb8dd907) ocaml-cppo-ocamlbuild ( =  1.6.9-12.el10) ocaml-cppo-ocamlbuild(x86-64) ( =  1.6.9-12.el10) ocamlx(Ocamlbuild_cppo) ( =  425ba7bf23b11f46f0eb0cc3402faf3d)"
