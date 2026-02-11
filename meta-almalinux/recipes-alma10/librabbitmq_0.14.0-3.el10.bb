
PN = "librabbitmq"
PE = "0"
PV = "0.14.0"
PR = "3.el10"
PACKAGES = "librabbitmq librabbitmq-tools librabbitmq-devel"


URI_librabbitmq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librabbitmq-0.14.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librabbitmq = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:librabbitmq = "librabbitmq.so.4()(64bit) ( ) librabbitmq(x86-64) ( =  0.14.0-3.el10) librabbitmq ( =  0.14.0-3.el10)"

URI_librabbitmq-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librabbitmq-tools-0.14.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librabbitmq-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) librabbitmq.so.4()(64bit) ( ) librabbitmq(x86-64) ( =  0.14.0-3.el10)"
RPROVIDES:librabbitmq-tools = "librabbitmq-tools ( =  0.14.0-3.el10) librabbitmq-tools(x86-64) ( =  0.14.0-3.el10)"

URI_librabbitmq-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librabbitmq-devel-0.14.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librabbitmq-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) librabbitmq.so.4()(64bit) ( ) librabbitmq(x86-64) ( =  0.14.0-3.el10)"
RPROVIDES:librabbitmq-devel = "cmake(rabbitmq-c) ( =  0.14.0) librabbitmq-devel ( =  0.14.0-3.el10) librabbitmq-devel(x86-64) ( =  0.14.0-3.el10) pkgconfig(librabbitmq) ( =  0.14.0)"
