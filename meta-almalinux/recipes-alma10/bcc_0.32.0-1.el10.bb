
PN = "bcc"
PE = "0"
PV = "0.32.0"
PR = "1.el10"
PACKAGES = "bcc bcc-tools libbpf-tools python3-bcc bcc-devel bcc-doc"


URI_bcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bcc-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bcc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libLLVM.so.19.1()(64bit) ( ) libLLVM.so.19.1(LLVM_19.1)(64bit) ( ) libbpf.so.1()(64bit) ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.7)(64bit) ( ) libbpf.so.1(LIBBPF_0.1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libelf.so.1(ELFUTILS_1.3)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.8)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.9)(64bit) ( ) libbpf.so.1(LIBBPF_0.6.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.5.0)(64bit) ( ) tar ( ) libdebuginfod.so.1()(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) ( ) libbpf.so.1(LIBBPF_0.7.0)(64bit) ( ) libclang-cpp.so.19.1()(64bit) ( ) libbpf.so.1(LIBBPF_0.0.5)(64bit) ( ) libbpf.so.1(LIBBPF_1.2.0)(64bit) ( ) libbpf ( >=  2:0.8.0-1)"
RPROVIDES:bcc = "libbcc_bpf.so.0()(64bit) ( ) libbcc.so.0()(64bit) ( ) bcc ( =  0.32.0-1.el10) bcc(x86-64) ( =  0.32.0-1.el10)"

URI_bcc-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bcc-tools-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bcc-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) libbpf.so.1()(64bit) ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) python3-netaddr ( ) libbcc_bpf.so.0()(64bit) ( ) bcc ( =  0.32.0-1.el10) python3-bcc ( =  0.32.0-1.el10)"
RPROVIDES:bcc-tools = "bcc-tools ( =  0.32.0-1.el10) bcc-tools(x86-64) ( =  0.32.0-1.el10)"

URI_libbpf-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libbpf-tools-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbpf-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libelf.so.1(ELFUTILS_1.3)(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( )"
RPROVIDES:libbpf-tools = "libbpf-tools ( =  0.32.0-1.el10) libbpf-tools(x86-64) ( =  0.32.0-1.el10)"

URI_python3-bcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-bcc-0.32.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-bcc = "python(abi) ( =  3.12) bcc ( =  0.32.0-1.el10)"
RPROVIDES:python3-bcc = "python3-bcc ( =  0.32.0-1.el10) python-bcc ( =  0.32.0-1.el10) python3.12-bcc ( =  0.32.0-1.el10) python3.12dist(bcc) ( =  0.32) python3dist(bcc) ( =  0.32)"

URI_bcc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bcc-devel-0.32.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bcc-devel = "/usr/bin/pkg-config ( ) libbcc.so.0()(64bit) ( ) libbcc_bpf.so.0()(64bit) ( ) bcc(x86-64) ( =  0.32.0-1.el10)"
RPROVIDES:bcc-devel = "bcc-devel ( =  0.32.0-1.el10) bcc-devel(x86-64) ( =  0.32.0-1.el10) pkgconfig(libbcc) ( =  0.32.0)"

URI_bcc-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bcc-doc-0.32.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:bcc-doc = ""
RPROVIDES:bcc-doc = "bcc-doc ( =  0.32.0-1.el10)"
