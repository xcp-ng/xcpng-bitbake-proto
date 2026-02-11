
PN = "socket_wrapper"
PE = "0"
PV = "1.4.0"
PR = "6.el10"
PACKAGES = "socket_wrapper libsocket_wrapper_noop libsocket_wrapper_noop-devel"


URI_socket_wrapper = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/socket_wrapper-1.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:socket_wrapper = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) cmake-filesystem(x86-64) ( )"
RPROVIDES:socket_wrapper = "libsocket_wrapper.so.0()(64bit) ( ) cmake(socket_wrapper) ( =  1.4.0) pkgconfig(socket_wrapper) ( =  1.4.0) socket_wrapper ( =  1.4.0-6.el10) socket_wrapper(x86-64) ( =  1.4.0-6.el10)"

URI_libsocket_wrapper_noop = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsocket_wrapper_noop-1.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsocket_wrapper_noop = "rtld(GNU_HASH) ( )"
RPROVIDES:libsocket_wrapper_noop = "libsocket_wrapper_noop.so.0()(64bit) ( ) libsocket_wrapper_noop ( =  1.4.0-6.el10) libsocket_wrapper_noop(x86-64) ( =  1.4.0-6.el10)"

URI_libsocket_wrapper_noop-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsocket_wrapper_noop-devel-1.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsocket_wrapper_noop-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libsocket_wrapper_noop.so.0()(64bit) ( ) libsocket_wrapper_noop ( =  1.4.0-6.el10)"
RPROVIDES:libsocket_wrapper_noop-devel = "cmake(socket_wrapper_noop) ( ) libsocket_wrapper_noop-devel ( =  1.4.0-6.el10) libsocket_wrapper_noop-devel(x86-64) ( =  1.4.0-6.el10) pkgconfig(socket_wrapper_noop) ( =  1.4.0)"
