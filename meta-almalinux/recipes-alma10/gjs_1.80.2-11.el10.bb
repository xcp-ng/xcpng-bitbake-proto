
PN = "gjs"
PE = "0"
PV = "1.80.2"
PR = "11.el10"
PACKAGES = "gjs gjs-devel gjs-tests"


URI_gjs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gjs-1.80.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gjs = "
 zlib-ng-compat
 gobject-introspection
 libffi
 libgcc
 readline
 libX11
 libstdc++
 glib2
 cairo
 cairo-gobject
 glibc
 libicu
"

URI_gjs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gjs-devel-1.80.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gjs-devel = "
 gjs
 glib2-devel
 pkgconf-pkg-config
 cairo-devel
 gobject-introspection-devel
 cairo-gobject-devel
 libffi-devel
"

URI_gjs-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gjs-tests-1.80.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gjs-tests = "
 gjs
 gobject-introspection
 libgcc
 libstdc++
 bash
 glib2
 cairo
 cairo-gobject
 glibc
"
