
PN = "hivex"
PE = "0"
PV = "1.3.24"
PR = "2.el10"
PACKAGES = "hivex hivex-libs perl-hivex hivex-devel ocaml-hivex ocaml-hivex-devel python3-hivex ruby-hivex"


URI_hivex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hivex = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libreadline.so.8()(64bit) ( ) libhivex.so.0()(64bit) ( ) hivex-libs ( =  1.3.24-2.el10)"
RPROVIDES:hivex = "hivex ( =  1.3.24-2.el10) hivex(x86-64) ( =  1.3.24-2.el10)"

URI_hivex-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hivex-libs-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hivex-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:hivex-libs = "libhivex.so.0()(64bit) ( ) hivex-libs ( =  1.3.24-2.el10) hivex-libs(x86-64) ( =  1.3.24-2.el10)"

URI_perl-hivex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-hivex = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(XSLoader) ( ) perl(Getopt::Long) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Encode) ( ) perl(bytes) ( ) perl(Pod::Usage) ( ) libhivex.so.0()(64bit) ( ) hivex-libs ( =  1.3.24-2.el10)"
RPROVIDES:perl-hivex = "perl(Win::Hivex) ( ) perl(Win::Hivex::Regedit) ( ) perl-hivex ( =  1.3.24-2.el10) perl-hivex(x86-64) ( =  1.3.24-2.el10)"

URI_hivex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/hivex-devel-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hivex-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libhivex.so.0()(64bit) ( ) hivex-libs ( =  1.3.24-2.el10)"
RPROVIDES:hivex-devel = "hivex-devel(x86-64) ( =  1.3.24-2.el10) hivex-devel ( =  1.3.24-2.el10) pkgconfig(hivex) ( =  1.3.24)"

URI_ocaml-hivex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-hivex = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libhivex.so.0()(64bit) ( ) ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Bigarray) ( =  8317b42277334e4ae5794d3cbabcaf4f) ocaml(Stdlib__Complex) ( =  052959c6d02e4e692e7944dd137c4095) ocaml(Unix) ( =  59e61ff7441dfacaa24d4eed6d45eeda) ocaml(Stdlib__Callback) ( =  b855f824a6cb0f4b58dc69a6e79a49a1) hivex-libs(x86-64) ( =  1.3.24-2.el10)"
RPROVIDES:ocaml-hivex = "ocaml(Hivex) ( =  306a3fe8a1478dbef11e197c1a97f9a6) ocaml-hivex(x86-64) ( =  1.3.24-2.el10) ocaml-hivex ( =  1.3.24-2.el10)"

URI_ocaml-hivex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-hivex-devel-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-hivex-devel = "ocaml(CamlinternalFormatBasics) ( =  2ef2d91ced81f6c72f852bab8ab406e0) ocaml(Stdlib) ( =  e8d9af458547c45080a71b9a6eaed658) ocaml(Stdlib__Bigarray) ( =  8317b42277334e4ae5794d3cbabcaf4f) ocaml(Stdlib__Complex) ( =  052959c6d02e4e692e7944dd137c4095) ocaml(Unix) ( =  59e61ff7441dfacaa24d4eed6d45eeda) ocaml(Stdlib__Callback) ( =  b855f824a6cb0f4b58dc69a6e79a49a1) ocamlx(Stdlib__Callback) ( =  bafc96ea60f2aa399fe753ac0e40f764) hivex-devel(x86-64) ( =  1.3.24-2.el10) ocaml-hivex(x86-64) ( =  1.3.24-2.el10)"
RPROVIDES:ocaml-hivex-devel = "ocaml(Hivex) ( =  306a3fe8a1478dbef11e197c1a97f9a6) ocaml-hivex-devel ( =  1.3.24-2.el10) ocaml-hivex-devel(x86-64) ( =  1.3.24-2.el10) ocamlx(Hivex) ( =  ebef6a8e04c128b6bc8ffb9f3f001dec)"

URI_python3-hivex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-hivex = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libhivex.so.0()(64bit) ( ) python(abi) ( =  3.12) hivex-libs ( =  1.3.24-2.el10)"
RPROVIDES:python3-hivex = "libhivexmod.cpython-312-x86_64-linux-gnu.so()(64bit) ( ) python-hivex ( =  1.3.24-2.el10) python3-hivex ( =  1.3.24-2.el10) python3-hivex(x86-64) ( =  1.3.24-2.el10) python3.12-hivex ( =  1.3.24-2.el10)"

URI_ruby-hivex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ruby-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-hivex = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libhivex.so.0()(64bit) ( ) ruby ( ) libruby.so.3.3()(64bit) ( ) ruby(release) ( ) hivex-libs ( =  1.3.24-2.el10)"
RPROVIDES:ruby-hivex = "ruby(hivex) ( =  1.3.24) ruby-hivex ( =  1.3.24-2.el10) ruby-hivex(x86-64) ( =  1.3.24-2.el10)"
