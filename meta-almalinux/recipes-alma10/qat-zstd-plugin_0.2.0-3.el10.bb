
PN = "qat-zstd-plugin"
PE = "0"
PV = "0.2.0"
PR = "3.el10"
PACKAGES = "qat-zstd-plugin qat-zstd-plugin-devel qat-zstd-plugin-static"


URI_qat-zstd-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qat-zstd-plugin-0.2.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qat-zstd-plugin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libqat.so.4()(64bit) ( ) libusdm.so.0()(64bit) ( )"
RPROVIDES:qat-zstd-plugin = "libqatseqprod.so.0()(64bit) ( ) qat-zstd-plugin(x86-64) ( =  0.2.0-3.el10) qat-zstd-plugin ( =  0.2.0-3.el10)"

URI_qat-zstd-plugin-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qat-zstd-plugin-devel-0.2.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qat-zstd-plugin-devel = "libqatseqprod.so.0()(64bit) ( ) qat-zstd-plugin(x86-64) ( =  0.2.0-3.el10)"
RPROVIDES:qat-zstd-plugin-devel = "qat-zstd-plugin-devel ( =  0.2.0-3.el10) qat-zstd-plugin-devel(x86-64) ( =  0.2.0-3.el10)"

URI_qat-zstd-plugin-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qat-zstd-plugin-static-0.2.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qat-zstd-plugin-static = "qat-zstd-plugin-devel(x86-64) ( =  0.2.0-3.el10)"
RPROVIDES:qat-zstd-plugin-static = "qat-zstd-plugin-static ( =  0.2.0-3.el10) qat-zstd-plugin-static(x86-64) ( =  0.2.0-3.el10)"
