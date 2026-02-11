
PN = "ocaml-dune"
PE = "0"
PV = "3.16.0"
PR = "4.el10"
PACKAGES = "ocaml-dune ocaml-dune-emacs ocaml-chrome-trace ocaml-chrome-trace-devel ocaml-dune-action-plugin ocaml-dune-action-plugin-devel ocaml-dune-build-info ocaml-dune-build-info-devel ocaml-dune-configurator ocaml-dune-glob ocaml-dune-glob-devel ocaml-dune-private-libs ocaml-dune-private-libs-devel ocaml-dune-rpc ocaml-dune-rpc-devel ocaml-dune-site ocaml-dune-site-devel ocaml-dyn ocaml-dyn-devel ocaml-ocamlc-loc ocaml-ocamlc-loc-devel ocaml-ordering ocaml-ordering-devel ocaml-stdune ocaml-stdune-devel ocaml-xdg ocaml-xdg-devel"


URI_ocaml-dune = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-dune-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune = " \
 glibc \
 ocaml-compiler-libs \
 ocaml-rpm-macros \
"

URI_ocaml-dune-emacs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-dune-emacs-3.16.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:ocaml-dune-emacs = " \
 ocaml-dune \
 emacs-filesystem \
"

URI_ocaml-chrome-trace = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-chrome-trace-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-chrome-trace = " \
 glibc \
 ocaml-runtime \
 ocaml-dune \
"

URI_ocaml-chrome-trace-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-chrome-trace-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-chrome-trace-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-chrome-trace \
"

URI_ocaml-dune-action-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-action-plugin-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-action-plugin = " \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-stdune \
 ocaml-xdg \
 ocaml-dune \
 ocaml-dune-glob \
 glibc \
 ocaml-dune-rpc \
 ocaml-dyn \
"

URI_ocaml-dune-action-plugin-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-action-plugin-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-action-plugin-devel = " \
 ocaml \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-ordering-devel \
 ocaml-stdune \
 ocaml-stdune-devel \
 ocaml-xdg \
 ocaml-dune-action-plugin \
 ocaml-dune-glob \
 ocaml-dune-glob-devel \
 ocaml-dune-rpc \
 ocaml-dune-rpc-devel \
 ocaml-dyn \
 ocaml-dyn-devel \
"

URI_ocaml-dune-build-info = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-build-info-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-build-info = " \
 glibc \
 ocaml-runtime \
 ocaml-dune \
"

URI_ocaml-dune-build-info-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-build-info-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-build-info-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-dune-build-info \
"

URI_ocaml-dune-configurator = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-configurator-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-configurator = " \
 glibc \
 ocaml-runtime \
 ocaml-dune \
 ocaml-stdune \
"

URI_ocaml-dune-glob = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-glob-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-glob = " \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-stdune \
 ocaml-dune-private-libs \
 ocaml-dune \
 glibc \
 ocaml-dyn \
"

URI_ocaml-dune-glob-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-glob-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-glob-devel = " \
 ocaml \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-stdune \
 ocaml-stdune-devel \
 ocaml-dune-glob \
 ocaml-dune-private-libs \
 ocaml-dune-private-libs-devel \
 ocaml-dyn \
 ocaml-dyn-devel \
"

URI_ocaml-dune-private-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-private-libs-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-private-libs = " \
 glibc \
 ocaml-runtime \
 ocaml-dune \
 ocaml-stdune \
"

URI_ocaml-dune-private-libs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-private-libs-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-private-libs-devel = " \
 ocaml-dune-private-libs \
 ocaml-runtime \
 ocaml \
 ocaml-dyn-devel \
"

URI_ocaml-dune-rpc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-rpc-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-rpc = " \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-stdune \
 ocaml-xdg \
 ocaml-dune \
 glibc \
 ocaml-dyn \
"

URI_ocaml-dune-rpc-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-rpc-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-rpc-devel = " \
 ocaml \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-ordering-devel \
 ocaml-stdune \
 ocaml-stdune-devel \
 ocaml-xdg \
 ocaml-xdg-devel \
 ocaml-dune-rpc \
 ocaml-dyn \
 ocaml-dyn-devel \
"

URI_ocaml-dune-site = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-site-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-site = " \
 ocaml-runtime \
 ocaml-compiler-libs \
 ocaml-dune-private-libs \
 ocaml-dune \
 glibc \
"

URI_ocaml-dune-site-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dune-site-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dune-site-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-dune-private-libs \
 ocaml-dune-private-libs-devel \
 ocaml-dune-site \
"

URI_ocaml-dyn = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dyn-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dyn = " \
 glibc \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-dune \
"

URI_ocaml-dyn-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-dyn-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-dyn-devel = " \
 ocaml \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-ordering-devel \
 ocaml-dyn \
"

URI_ocaml-ocamlc-loc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-ocamlc-loc-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-ocamlc-loc = " \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-dune \
 glibc \
 ocaml-dyn \
"

URI_ocaml-ocamlc-loc-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-ocamlc-loc-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-ocamlc-loc-devel = " \
 ocaml \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-ocamlc-loc \
 ocaml-dyn \
 ocaml-dyn-devel \
"

URI_ocaml-ordering = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-ordering-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-ordering = " \
 glibc \
 ocaml-runtime \
 ocaml-dune \
"

URI_ocaml-ordering-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-ordering-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-ordering-devel = " \
 ocaml-runtime \
 ocaml-ordering \
"

URI_ocaml-stdune = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-stdune-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-stdune = " \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-dune \
 glibc \
 ocaml-dyn \
"

URI_ocaml-stdune-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-stdune-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-stdune-devel = " \
 ocaml \
 ocaml-runtime \
 ocaml-ordering \
 ocaml-ordering-devel \
 ocaml-stdune \
 ocaml-dyn \
 ocaml-dyn-devel \
"

URI_ocaml-xdg = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-xdg-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-xdg = " \
 glibc \
 ocaml-runtime \
 ocaml-dune \
"

URI_ocaml-xdg-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ocaml-xdg-devel-3.16.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-xdg-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-xdg \
"
