
PN = "brltty"
PE = "0"
PV = "6.6"
PR = "16.el10"
PACKAGES = "brlapi brltty brltty-at-spi2 brltty-docs brltty-dracut brltty-espeak-ng brltty-xw python3-brlapi brlapi-devel ocaml-brlapi brlapi-java brltty-minimal tcl-brlapi"


URI_brlapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brlapi = "/bin/sh ( ) coreutils ( ) shadow-utils ( ) util-linux ( ) glibc-common ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libXfixes.so.3()(64bit) ( ) libicuuc.so.74()(64bit) ( ) libXtst.so.6()(64bit) ( ) lua(abi) ( =  5.4)"
RPROVIDES:brlapi = "libbrlapi.so.0.8()(64bit) ( ) brlapi(x86-64) ( =  0.8.5-16.el10) brlapi ( =  0.8.5-16.el10) group(brlapi) ( =  ZyBicmxhcGkgLQAA)"

URI_brltty = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty = "/bin/sh ( ) systemd ( ) coreutils ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) /usr/bin/bash ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libicuuc.so.74()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libbluetooth.so.3()(64bit) ( ) libbrlapi.so.0.8()(64bit) ( ) libpcre2-32.so.0()(64bit) ( )"
RPROVIDES:brltty = "brltty(x86-64) ( =  6.6-16.el10) brltty ( =  6.6-16.el10) config(brltty) ( =  6.6-16.el10)"

URI_brltty-at-spi2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-at-spi2-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-at-spi2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libXfixes.so.3()(64bit) ( ) libatspi.so.0()(64bit) ( ) brltty(x86-64) ( =  6.6-16.el10)"
RPROVIDES:brltty-at-spi2 = "brltty-at-spi2 ( =  6.6-16.el10) brltty-at-spi2(x86-64) ( =  6.6-16.el10)"

URI_brltty-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-docs-6.6-16.el10.noarch.rpm;unpack=0"
RDEPENDS:brltty-docs = "brltty ( =  6.6-16.el10)"
RPROVIDES:brltty-docs = "brltty-docs ( =  6.6-16.el10)"

URI_brltty-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-dracut-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-dracut = "/usr/bin/bash ( ) dracut ( ) brltty(x86-64) ( =  6.6-16.el10)"
RPROVIDES:brltty-dracut = "brltty-dracut ( =  6.6-16.el10) brltty-dracut(x86-64) ( =  6.6-16.el10) config(brltty-dracut) ( =  6.6-16.el10)"

URI_brltty-espeak-ng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-espeak-ng-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-espeak-ng = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libespeak-ng.so.1()(64bit) ( ) brltty(x86-64) ( =  6.6-16.el10)"
RPROVIDES:brltty-espeak-ng = "brltty-espeak-ng ( =  6.6-16.el10) brltty-espeak-ng(x86-64) ( =  6.6-16.el10)"

URI_brltty-xw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-xw-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-xw = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libXt.so.6()(64bit) ( ) libXaw.so.7()(64bit) ( ) xorg-x11-fonts-misc ( ) brltty(x86-64) ( =  6.6-16.el10)"
RPROVIDES:brltty-xw = "brltty-xw ( =  6.6-16.el10) brltty-xw(x86-64) ( =  6.6-16.el10)"

URI_python3-brlapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-brlapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libbrlapi.so.0.8()(64bit) ( ) python(abi) ( =  3.12) brlapi(x86-64) ( =  0.8.5-16.el10)"
RPROVIDES:python3-brlapi = "python-brlapi ( =  0.8.5-16.el10) python3-brlapi ( =  0.8.5-16.el10) python3-brlapi(x86-64) ( =  0.8.5-16.el10) python3.12-brlapi ( =  0.8.5-16.el10) python3.12dist(brlapi) ( =  0.8.5) python3dist(brlapi) ( =  0.8.5)"

URI_brlapi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/brlapi-devel-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brlapi-devel = "/usr/bin/pkg-config ( ) libbrlapi.so.0.8()(64bit) ( ) brlapi(x86-64) ( =  0.8.5-16.el10)"
RPROVIDES:brlapi-devel = "brlapi-devel ( =  0.8.5-16.el10) brlapi-devel(x86-64) ( =  0.8.5-16.el10) pkgconfig(brltty) ( =  6.6)"

URI_ocaml-brlapi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-brlapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libbrlapi.so.0.8()(64bit) ( ) ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Either) ( =  d56b2e9ca14b69fdeef09f3b2fbd10ad) ocaml(Stdlib__Seq) ( =  ac22688c50c848ab417492a023ff76ab) ocaml(Stdlib__Bigarray) ( =  8317b42277334e4ae5794d3cbabcaf4f) ocaml(Stdlib__Complex) ( =  052959c6d02e4e692e7944dd137c4095) ocaml(Stdlib__Int32) ( =  9cc80815720f462a0569c994dd5f43cc) ocaml(Unix) ( =  59e61ff7441dfacaa24d4eed6d45eeda) ocaml(Stdlib__Array) ( =  75e38d886ba62047f48c000ae7d8f6f4) ocaml(Stdlib__Callback) ( =  b855f824a6cb0f4b58dc69a6e79a49a1) ocamlx(Stdlib__Array) ( =  b3215f99afe054938b4b66df456093cb) ocamlx(Stdlib__Callback) ( =  bafc96ea60f2aa399fe753ac0e40f764) brlapi(x86-64) ( =  0.8.5-16.el10)"
RPROVIDES:ocaml-brlapi = "ocaml(Brlapi) ( =  f063e8843d6489365c8d03dff68a17dc) ocaml-brlapi ( =  0.8.5-16.el10) ocaml-brlapi(x86-64) ( =  0.8.5-16.el10) ocamlx(Brlapi) ( =  7babe0f76f6920ee8e07778b16224534)"

URI_brlapi-java = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/brlapi-java-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brlapi-java = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libbrlapi.so.0.8()(64bit) ( ) brlapi(x86-64) ( =  0.8.5-16.el10)"
RPROVIDES:brlapi-java = "libbrlapi_java.so.0.8()(64bit) ( ) brlapi-java ( =  0.8.5-16.el10) brlapi-java(x86-64) ( =  0.8.5-16.el10)"

URI_brltty-minimal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/brltty-minimal-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-minimal = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/python3 ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libbluetooth.so.3()(64bit) ( ) libpcre2-32.so.0()(64bit) ( )"
RPROVIDES:brltty-minimal = "brltty-minimal ( =  6.6-16.el10) brltty-minimal(x86-64) ( =  6.6-16.el10) config(brltty-minimal) ( =  6.6-16.el10)"

URI_tcl-brlapi = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tcl-brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tcl-brlapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libtcl8.6.so()(64bit) ( ) libbrlapi.so.0.8()(64bit) ( ) brlapi(x86-64) ( =  0.8.5-16.el10)"
RPROVIDES:tcl-brlapi = "libbrlapi_tcl.so.0.8()(64bit) ( ) tcl-brlapi ( =  0.8.5-16.el10) tcl-brlapi(x86-64) ( =  0.8.5-16.el10)"
