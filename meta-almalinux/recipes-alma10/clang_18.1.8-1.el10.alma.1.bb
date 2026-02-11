
PN = "clang"
PE = "0"
PV = "18.1.8"
PR = "1.el10.alma.1"
PACKAGES = "clang-resource-filesystem"


URI_clang-resource-filesystem = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/clang-resource-filesystem-18.1.8-1.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:clang-resource-filesystem = ""
RPROVIDES:clang-resource-filesystem = "rpm_macro(clang_major_version) ( ) rpm_macro(clang_minor_version) ( ) rpm_macro(clang_patch_version) ( ) rpm_macro(clang_resource_dir) ( ) rpm_macro(clang_version) ( ) clang-resource-filesystem ( =  18.1.8-1.el10.alma.1) clang-resource-filesystem(major) ( =  18)"
