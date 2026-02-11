
PN = "edk2"
PE = "0"
PV = "20241117"
PR = "2.el10_0.1"
PACKAGES = "edk2-aarch64 edk2-ovmf edk2-aarch64 edk2-ovmf edk2-tools edk2-tools-doc"


URI_edk2-aarch64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/edk2-aarch64-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-aarch64 = ""
RPROVIDES:edk2-aarch64 = "bundled(openssl) ( =  3.0.7) AAVMF ( =  20241117-2.el10_0.1) edk2-aarch64 ( =  20241117-2.el10_0.1)"

URI_edk2-ovmf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/edk2-ovmf-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-ovmf = ""
RPROVIDES:edk2-ovmf = "bundled(openssl) ( =  3.0.7) OVMF ( =  20241117-2.el10_0.1) edk2-ovmf ( =  20241117-2.el10_0.1)"

URI_edk2-aarch64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-aarch64-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-aarch64 = ""
RPROVIDES:edk2-aarch64 = "bundled(openssl) ( =  3.0.7) AAVMF ( =  20241117-2.el10_0.1) edk2-aarch64 ( =  20241117-2.el10_0.1)"

URI_edk2-ovmf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-ovmf-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-ovmf = ""
RPROVIDES:edk2-ovmf = "bundled(openssl) ( =  3.0.7) OVMF ( =  20241117-2.el10_0.1) edk2-ovmf ( =  20241117-2.el10_0.1)"

URI_edk2-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-tools-20241117-2.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:edk2-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) /usr/bin/bash ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( )"
RPROVIDES:edk2-tools = "edk2-tools ( =  20241117-2.el10_0.1) edk2-tools(x86-64) ( =  20241117-2.el10_0.1)"

URI_edk2-tools-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/edk2-tools-doc-20241117-2.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:edk2-tools-doc = ""
RPROVIDES:edk2-tools-doc = "edk2-tools-doc ( =  20241117-2.el10_0.1)"
