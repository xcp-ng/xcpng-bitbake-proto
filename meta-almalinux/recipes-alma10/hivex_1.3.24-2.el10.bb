
PN = "hivex"
PE = "0"
PV = "1.3.24"
PR = "2.el10"
PACKAGES = "hivex hivex-libs perl-hivex hivex-devel ocaml-hivex ocaml-hivex-devel python3-hivex ruby-hivex"


URI_hivex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hivex = "
 readline
 libxml2
 bash
 glibc
 hivex-libs
"

URI_hivex-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hivex-libs-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hivex-libs = "
 glibc
"

URI_perl-hivex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-hivex = "
 perl-libs
 perl-Carp
 perl-interpreter
 perl-vars
 perl-Getopt-Long
 perl-Encode
 glibc
 perl-Exporter
 hivex-libs
 perl-Pod-Usage
"

URI_hivex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/hivex-devel-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hivex-devel = "
 hivex-libs
 pkgconf-pkg-config
"

URI_ocaml-hivex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-hivex = "
 glibc
 ocaml-runtime
 hivex-libs
"

URI_ocaml-hivex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-hivex-devel-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-hivex-devel = "
 ocaml-runtime
 ocaml-hivex
 ocaml
 hivex-devel
"

URI_python3-hivex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-hivex = "
 glibc
 hivex-libs
 python3
"

URI_ruby-hivex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ruby-hivex-1.3.24-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-hivex = "
 glibc
 ruby-libs
 hivex-libs
 ruby
"
