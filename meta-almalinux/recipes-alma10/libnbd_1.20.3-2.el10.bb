
PN = "libnbd"
PE = "0"
PV = "1.20.3"
PR = "2.el10"
PACKAGES = "libnbd libnbd-bash-completion nbdfuse python3-libnbd libnbd-devel ocaml-libnbd ocaml-libnbd-devel"


URI_libnbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnbd-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnbd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_3)(64bit) ( )"
RPROVIDES:libnbd = "libnbd.so.0()(64bit) ( ) libnbd.so.0(LIBNBD_1.0)(64bit) ( ) libnbd.so.0(LIBNBD_1.2)(64bit) ( ) libnbd.so.0(LIBNBD_1.12)(64bit) ( ) libnbd.so.0(LIBNBD_1.4)(64bit) ( ) libnbd.so.0(LIBNBD_1.16)(64bit) ( ) libnbd.so.0(LIBNBD_1.18)(64bit) ( ) libnbd.so.0(LIBNBD_1.6)(64bit) ( ) libnbd.so.0(LIBNBD_1.8)(64bit) ( ) libnbd(x86-64) ( =  1.20.3-2.el10) libnbd ( =  1.20.3-2.el10)"

URI_libnbd-bash-completion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnbd-bash-completion-1.20.3-2.el10.noarch.rpm;unpack=0"
RDEPENDS:libnbd-bash-completion = "bash-completion ( >=  2.0) libnbd ( =  1.20.3-2.el10)"
RPROVIDES:libnbd-bash-completion = "libnbd-bash-completion ( =  1.20.3-2.el10)"

URI_nbdfuse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdfuse-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdfuse = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libfuse3.so.3()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libnbd.so.0()(64bit) ( ) libnbd.so.0(LIBNBD_1.0)(64bit) ( ) libnbd.so.0(LIBNBD_1.2)(64bit) ( ) libfuse3.so.3(FUSE_3.1)(64bit) ( ) libfuse3.so.3(FUSE_3.12)(64bit) ( ) libnbd(x86-64) ( =  1.20.3-2.el10)"
RPROVIDES:nbdfuse = "nbdfuse ( =  1.20.3-2.el10) nbdfuse(x86-64) ( =  1.20.3-2.el10)"

URI_python3-libnbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libnbd-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libnbd = "rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libxml2.so.2()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libnbd.so.0()(64bit) ( ) libnbd.so.0(LIBNBD_1.0)(64bit) ( ) libnbd.so.0(LIBNBD_1.2)(64bit) ( ) libnbd.so.0(LIBNBD_1.12)(64bit) ( ) libnbd.so.0(LIBNBD_1.4)(64bit) ( ) libnbd.so.0(LIBNBD_1.16)(64bit) ( ) libnbd.so.0(LIBNBD_1.18)(64bit) ( ) libnbd.so.0(LIBNBD_1.6)(64bit) ( ) libnbd.so.0(LIBNBD_1.8)(64bit) ( ) python(abi) ( =  3.12) libnbd(x86-64) ( =  1.20.3-2.el10)"
RPROVIDES:python3-libnbd = "python-libnbd ( =  1.20.3-2.el10) python3-libnbd ( =  1.20.3-2.el10) python3-libnbd(x86-64) ( =  1.20.3-2.el10) python3.12-libnbd ( =  1.20.3-2.el10)"

URI_libnbd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnbd-devel-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnbd-devel = "/usr/bin/pkg-config ( ) libnbd.so.0()(64bit) ( ) libnbd(x86-64) ( =  1.20.3-2.el10)"
RPROVIDES:libnbd-devel = "libnbd-devel ( =  1.20.3-2.el10) libnbd-devel(x86-64) ( =  1.20.3-2.el10) pkgconfig(libnbd) ( =  1.20.3)"

URI_ocaml-libnbd = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libnbd-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-libnbd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libnbd.so.0()(64bit) ( ) libnbd.so.0(LIBNBD_1.0)(64bit) ( ) libnbd.so.0(LIBNBD_1.12)(64bit) ( ) libnbd.so.0(LIBNBD_1.16)(64bit) ( ) libnbd.so.0(LIBNBD_1.18)(64bit) ( ) libnbd.so.0(LIBNBD_1.2)(64bit) ( ) libnbd.so.0(LIBNBD_1.4)(64bit) ( ) libnbd.so.0(LIBNBD_1.6)(64bit) ( ) libnbd.so.0(LIBNBD_1.8)(64bit) ( ) ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Either) ( =  d56b2e9ca14b69fdeef09f3b2fbd10ad) ocaml(Stdlib__Seq) ( =  ac22688c50c848ab417492a023ff76ab) ocaml(Stdlib__Bigarray) ( =  8317b42277334e4ae5794d3cbabcaf4f) ocaml(Stdlib__Complex) ( =  052959c6d02e4e692e7944dd137c4095) ocaml(Stdlib__Int32) ( =  9cc80815720f462a0569c994dd5f43cc) ocaml(Stdlib__Obj) ( =  592f14b225bd7cf0051f4b04372640d7) ocaml(Stdlib__String) ( =  cdb3775f91c0e999766c3b2a50f03a7d) ocaml(Stdlib__Uchar) ( =  7eb8f0d1a7c18933885eaef3b23d79f4) ocaml(Unix) ( =  59e61ff7441dfacaa24d4eed6d45eeda) ocaml(Stdlib__Printexc) ( =  1e5e75f741ca414dd916c0c65b646827) ocaml(Stdlib__Bytes) ( =  d5a54ebfd096c4af2a47315dda118f2d) ocaml(Stdlib__Callback) ( =  b855f824a6cb0f4b58dc69a6e79a49a1) ocaml(Stdlib__Gc) ( =  117a859136e8d0cad6ff77491c390228) libnbd(x86-64) ( =  1.20.3-2.el10)"
RPROVIDES:ocaml-libnbd = "ocaml(NBD) ( =  ea4fde404a213a61f726feb47242c17e) ocaml-libnbd(x86-64) ( =  1.20.3-2.el10) ocaml-libnbd ( =  1.20.3-2.el10)"

URI_ocaml-libnbd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libnbd-devel-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-libnbd-devel = "ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Either) ( =  d56b2e9ca14b69fdeef09f3b2fbd10ad) ocaml(Stdlib__Seq) ( =  ac22688c50c848ab417492a023ff76ab) ocaml(Stdlib__Bigarray) ( =  8317b42277334e4ae5794d3cbabcaf4f) ocaml(Stdlib__Complex) ( =  052959c6d02e4e692e7944dd137c4095) ocaml(Stdlib__Int32) ( =  9cc80815720f462a0569c994dd5f43cc) ocaml(Stdlib__Obj) ( =  592f14b225bd7cf0051f4b04372640d7) ocaml(Stdlib__String) ( =  cdb3775f91c0e999766c3b2a50f03a7d) ocaml(Stdlib__Uchar) ( =  7eb8f0d1a7c18933885eaef3b23d79f4) ocaml(Unix) ( =  59e61ff7441dfacaa24d4eed6d45eeda) ocaml(Stdlib__Printexc) ( =  1e5e75f741ca414dd916c0c65b646827) ocaml(Stdlib__Bytes) ( =  d5a54ebfd096c4af2a47315dda118f2d) ocaml(Stdlib__Callback) ( =  b855f824a6cb0f4b58dc69a6e79a49a1) ocaml(Stdlib__Gc) ( =  117a859136e8d0cad6ff77491c390228) ocamlx(Stdlib__Callback) ( =  bafc96ea60f2aa399fe753ac0e40f764) ocamlx(Stdlib__Gc) ( =  197914694cd716338b4da966236687f4) ocamlx(Stdlib__Bigarray) ( =  2fb6f37865dd77a707635669254911e1) ocaml-libnbd(x86-64) ( =  1.20.3-2.el10)"
RPROVIDES:ocaml-libnbd-devel = "ocaml(NBD) ( =  ea4fde404a213a61f726feb47242c17e) ocaml-libnbd-devel ( =  1.20.3-2.el10) ocaml-libnbd-devel(x86-64) ( =  1.20.3-2.el10) ocamlx(NBD) ( =  75da30e6f3ec42792dacd59dbd73a073)"
