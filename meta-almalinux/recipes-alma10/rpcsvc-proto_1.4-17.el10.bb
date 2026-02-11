
PN = "rpcsvc-proto"
PE = "0"
PV = "1.4"
PR = "17.el10"
PACKAGES = "rpcgen rpcsvc-proto-devel"


URI_rpcgen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpcgen-1.4-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpcgen = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:rpcgen = "rpcgen ( ) rpcgen ( =  1.4-17.el10) rpcgen(x86-64) ( =  1.4-17.el10)"

URI_rpcsvc-proto-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rpcsvc-proto-devel-1.4-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpcsvc-proto-devel = ""
RPROVIDES:rpcsvc-proto-devel = "rpcsvc-proto-devel ( =  1.4-17.el10) rpcsvc-proto-devel(x86-64) ( =  1.4-17.el10)"
