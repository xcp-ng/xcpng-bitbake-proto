
PN = "wayland"
PE = "0"
PV = "1.23.0"
PR = "2.el10"
PACKAGES = "libwayland-client libwayland-cursor libwayland-egl libwayland-server wayland-devel wayland-doc"


URI_libwayland-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-client-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-client = "
 glibc
 libffi
"

URI_libwayland-cursor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-cursor-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-cursor = "
 glibc
 libwayland-client
"

URI_libwayland-egl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-egl-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-egl = "
 glibc
"

URI_libwayland-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwayland-server-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwayland-server = "
 glibc
 libffi
"

URI_wayland-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wayland-devel-1.23.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wayland-devel = "
 wayland-devel
 libwayland-client
 libwayland-cursor
 libwayland-egl
 libwayland-server
 libxml2
 pkgconf-pkg-config
 expat
 glibc
 libffi-devel
"

URI_wayland-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/wayland-doc-1.23.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:wayland-doc = ""
