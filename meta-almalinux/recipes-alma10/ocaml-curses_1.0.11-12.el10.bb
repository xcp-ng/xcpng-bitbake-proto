
PN = "ocaml-curses"
PE = "0"
PV = "1.0.11"
PR = "12.el10"
PACKAGES = "ocaml-curses ocaml-curses-devel"


URI_ocaml-curses = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-curses-1.0.11-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-curses = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libncursesw.so.6()(64bit) ( ) libtinfo.so.6()(64bit) ( ) ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Either) ( =  d56b2e9ca14b69fdeef09f3b2fbd10ad) ocaml(Stdlib__Seq) ( =  ac22688c50c848ab417492a023ff76ab) ocaml(Stdlib__Bigarray) ( =  8317b42277334e4ae5794d3cbabcaf4f) ocaml(Stdlib__Complex) ( =  052959c6d02e4e692e7944dd137c4095) ocaml(Stdlib__List) ( =  0cd6f52e67f5324941afcf7df215a281) ocaml(Unix) ( =  59e61ff7441dfacaa24d4eed6d45eeda) ocaml(Stdlib__Hashtbl) ( =  a95c460b872969c8d1b778e529006189)"
RPROVIDES:ocaml-curses = "ocaml(Curses) ( =  af17f9f5489dedc373160a47f500ce6d) ocaml-curses(x86-64) ( =  1.0.11-12.el10) ocaml-curses ( =  1.0.11-12.el10)"

URI_ocaml-curses-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-curses-devel-1.0.11-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-curses-devel = "ncurses-devel(x86-64) ( ) ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Either) ( =  d56b2e9ca14b69fdeef09f3b2fbd10ad) ocaml(Stdlib__Seq) ( =  ac22688c50c848ab417492a023ff76ab) ocaml(Stdlib__Bigarray) ( =  8317b42277334e4ae5794d3cbabcaf4f) ocaml(Stdlib__Complex) ( =  052959c6d02e4e692e7944dd137c4095) ocaml(Stdlib__List) ( =  0cd6f52e67f5324941afcf7df215a281) ocaml(Unix) ( =  59e61ff7441dfacaa24d4eed6d45eeda) ocaml(Stdlib__Hashtbl) ( =  a95c460b872969c8d1b778e529006189) ocamlx(Stdlib) ( =  447646e3941e7bd0789ef2758721e0f3) ocamlx(Stdlib__List) ( =  0c98d5e09fe7a58103f7fc0c065faf7b) ocamlx(Stdlib__Hashtbl) ( =  32e5b8b459bfbe8d42f9cbdc0881f25b) ocamlx(Stdlib__Domain) ( =  cc0101b954510b60650e5e09ef15a63f) ocamlx(Stdlib__Random) ( =  8a2126a10d76d3c628e1b10cc98f4557) ocaml-curses(x86-64) ( =  1.0.11-12.el10)"
RPROVIDES:ocaml-curses-devel = "ocaml(Curses) ( =  af17f9f5489dedc373160a47f500ce6d) ocaml-curses-devel ( =  1.0.11-12.el10) ocaml-curses-devel(x86-64) ( =  1.0.11-12.el10) ocamlx(Curses) ( =  4f2300906516b4b4c08f6ba5e06ff40e)"
