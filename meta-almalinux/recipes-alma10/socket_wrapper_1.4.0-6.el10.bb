
inherit dnf-bridge

PN = "socket_wrapper"
PE = "0"
PV = "1.4.0"
PR = "6.el10"
PACKAGES = "socket_wrapper libsocket_wrapper_noop libsocket_wrapper_noop-devel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/socket_wrapper-1.4.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_socket_wrapper = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/socket_wrapper-1.4.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_socket_wrapper}"
RDEPENDS:socket_wrapper = " \
 glibc \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_libsocket_wrapper_noop = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsocket_wrapper_noop-1.4.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsocket_wrapper_noop}"
RDEPENDS:libsocket_wrapper_noop = " \
 glibc \
"

URI_libsocket_wrapper_noop-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsocket_wrapper_noop-devel-1.4.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsocket_wrapper_noop-devel}"
RDEPENDS:libsocket_wrapper_noop-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 libsocket_wrapper_noop \
"
